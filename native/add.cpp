/* add.cpp

   Demonstrates creating a DLL with an exported function in a flexible and
   elegant way.
*/

#include "add.h"

int ADDCALL Add(int a, int b)
{
  return ((a + b ) * 10);
}
