package io.burkard.cdk.services.lakeformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResource {

  def apply(
    internalResourceId: String,
    resourceArn: Option[String] = None,
    useServiceLinkedRole: Option[Boolean] = None,
    roleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lakeformation.CfnResource =
    software.amazon.awscdk.services.lakeformation.CfnResource.Builder
      .create(stackCtx, internalResourceId)
      .resourceArn(resourceArn.orNull)
      .useServiceLinkedRole(useServiceLinkedRole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .roleArn(roleArn.orNull)
      .build()
}
