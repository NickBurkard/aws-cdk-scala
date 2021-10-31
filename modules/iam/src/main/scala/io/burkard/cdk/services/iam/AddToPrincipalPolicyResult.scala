package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddToPrincipalPolicyResult {

  def apply(
    policyDependable: Option[software.constructs.IDependable] = None,
    statementAdded: Option[Boolean] = None
  ): software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult =
    (new software.amazon.awscdk.services.iam.AddToPrincipalPolicyResult.Builder)
      .policyDependable(policyDependable.orNull)
      .statementAdded(statementAdded.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
