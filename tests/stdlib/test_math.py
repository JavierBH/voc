import sys

from unittest import expectedFailure

from ..utils import TranspileTestCase

class SysModuleTests(TranspileTestCase):
    #######################################################
    # testing if import works
    def test_import(self):
        self.assertCodeExecution("""
            import math
            """)
    #######################################################
    # test if the TypeError raises correctly
    @expectedFailure
    def test_factorial_wrongType(self):
        self.assertCodeExecution("""
            import math
            print(math.factorial(None))
            """)
