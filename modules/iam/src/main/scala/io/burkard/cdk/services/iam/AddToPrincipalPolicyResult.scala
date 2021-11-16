package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddToPrincipalPolicyResult {

  def apply(
    statementAdded: Boolean,
    policyDependable: Option[software.constructs.IDependable] = None
  ): software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult =
    (new software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult.Builder)
      .statementAdded(statementAdded)
      .policyDependable(policyDependable.orNull)
      .build()
}
