package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGroupProps {

  def apply(
    name: Option[String] = None,
    tags: Option[AnyRef] = None,
    roleArn: Option[String] = None,
    initialVersion: Option[software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty] = None
  ): software.amazon.awscdk.services.greengrass.CfnGroupProps =
    (new software.amazon.awscdk.services.greengrass.CfnGroupProps.Builder)
      .name(name.orNull)
      .tags(tags.orNull)
      .roleArn(roleArn.orNull)
      .initialVersion(initialVersion.orNull)
      .build()
}
