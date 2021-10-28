package io.burkard.cdk.services.iam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnServiceLinkedRole {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    customSuffix: Option[String] = None,
    awsServiceName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnServiceLinkedRole =
    software.amazon.awscdk.services.iam.CfnServiceLinkedRole.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .customSuffix(customSuffix.orNull)
      .awsServiceName(awsServiceName.orNull)
      .build()
}
