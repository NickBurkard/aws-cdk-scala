package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnThemeProps {

  def apply(
    awsAccountId: String,
    themeId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissions: Option[List[_]] = None,
    baseThemeId: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty] = None,
    versionDescription: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnThemeProps =
    (new software.amazon.awscdk.services.quicksight.CfnThemeProps.Builder)
      .awsAccountId(awsAccountId)
      .themeId(themeId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .baseThemeId(baseThemeId.orNull)
      .configuration(configuration.orNull)
      .versionDescription(versionDescription.orNull)
      .build()
}
