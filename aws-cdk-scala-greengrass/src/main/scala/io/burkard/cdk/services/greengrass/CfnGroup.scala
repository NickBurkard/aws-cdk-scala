package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGroup {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    roleArn: Option[String] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.greengrass.CfnGroup =
    software.amazon.awscdk.services.greengrass.CfnGroup.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.orNull)
      .roleArn(roleArn.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
