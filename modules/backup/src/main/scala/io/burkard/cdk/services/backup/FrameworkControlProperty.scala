package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FrameworkControlProperty {

  def apply(
    controlName: Option[String] = None,
    controlScope: Option[AnyRef] = None,
    controlInputParameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty =
    (new software.amazon.awscdk.services.backup.CfnFramework.FrameworkControlProperty.Builder)
      .controlName(controlName.orNull)
      .controlScope(controlScope.orNull)
      .controlInputParameters(controlInputParameters.map(_.asJava).orNull)
      .build()
}
