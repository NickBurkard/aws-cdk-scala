package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnThemeProps {

  def apply(
    name: Option[String] = None,
    awsAccountId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissions: Option[List[_]] = None,
    baseThemeId: Option[String] = None,
    themeId: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty] = None,
    versionDescription: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnThemeProps =
    (new software.amazon.awscdk.services.quicksight.CfnThemeProps.Builder)
      .name(name.orNull)
      .awsAccountId(awsAccountId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .baseThemeId(baseThemeId.orNull)
      .themeId(themeId.orNull)
      .configuration(configuration.orNull)
      .versionDescription(versionDescription.orNull)
      .build()
}
