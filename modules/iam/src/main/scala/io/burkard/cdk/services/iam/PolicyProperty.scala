package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PolicyProperty {

  def apply(
    policyName: String,
    policyDocument: AnyRef
  ): software.amazon.awscdk.services.iam.CfnUser.PolicyProperty =
    (new software.amazon.awscdk.services.iam.CfnUser.PolicyProperty.Builder)
      .policyName(policyName)
      .policyDocument(policyDocument)
      .build()
}
