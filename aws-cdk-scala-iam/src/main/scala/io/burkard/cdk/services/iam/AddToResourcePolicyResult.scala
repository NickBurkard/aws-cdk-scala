package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddToResourcePolicyResult {

  def apply(
    policyDependable: Option[software.constructs.IDependable] = None,
    statementAdded: Option[Boolean] = None
  ): software.amazon.awscdk.services.iam.AddToResourcePolicyResult =
    (new software.amazon.awscdk.services.iam.AddToResourcePolicyResult.Builder)
      .policyDependable(policyDependable.orNull)
      .statementAdded(statementAdded.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
