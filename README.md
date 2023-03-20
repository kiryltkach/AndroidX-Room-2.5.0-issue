AndroidX Room 2.5.0 issue.

Room 2.4.3 is used in this repository, and with it it builds successfully. Changing Room dependency
to the version 2.5.0 causes build to fail with an error "ExampleDao_Impl is not abstract and does 
not override abstract method ...".

It looks like this issue is caused only when suspend method is used in the parent of abstract DAO
class. Removing suspend modifier from ExampleParent.kt resolves the issue.