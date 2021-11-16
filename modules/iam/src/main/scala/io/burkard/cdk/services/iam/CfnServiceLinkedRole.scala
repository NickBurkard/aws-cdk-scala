package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServiceLinkedRole {

  def apply(
    internalResourceId: String,
    awsServiceName: String,
    description: Option[String] = None,
    customSuffix: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnServiceLinkedRole =
    software.amazon.awscdk.services.iam.CfnServiceLinkedRole.Builder
      .create(stackCtx, internalResourceId)
      .awsServiceName(awsServiceName)
      .description(description.orNull)
      .customSuffix(customSuffix.orNull)
      .build()
}
