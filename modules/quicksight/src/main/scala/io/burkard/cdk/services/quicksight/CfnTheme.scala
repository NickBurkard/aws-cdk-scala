package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTheme {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    awsAccountId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissions: Option[List[_]] = None,
    baseThemeId: Option[String] = None,
    themeId: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.quicksight.CfnTheme.ThemeConfigurationProperty] = None,
    versionDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.quicksight.CfnTheme =
    software.amazon.awscdk.services.quicksight.CfnTheme.Builder
      .create(stackCtx, internalResourceId)
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
