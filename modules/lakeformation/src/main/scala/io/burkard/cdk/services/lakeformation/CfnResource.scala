package io.burkard.cdk.services.lakeformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResource {

  def apply(
    internalResourceId: String,
    resourceArn: String,
    useServiceLinkedRole: Boolean,
    roleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lakeformation.CfnResource =
    software.amazon.awscdk.services.lakeformation.CfnResource.Builder
      .create(stackCtx, internalResourceId)
      .resourceArn(resourceArn)
      .useServiceLinkedRole(useServiceLinkedRole)
      .roleArn(roleArn.orNull)
      .build()
}
