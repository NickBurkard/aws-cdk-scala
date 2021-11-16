package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddToResourcePolicyResult {

  def apply(
    statementAdded: Boolean,
    policyDependable: Option[software.constructs.IDependable] = None
  ): software.amazon.awscdk.services.iam.AddToResourcePolicyResult =
    (new software.amazon.awscdk.services.iam.AddToResourcePolicyResult.Builder)
      .statementAdded(statementAdded)
      .policyDependable(policyDependable.orNull)
      .build()
}
