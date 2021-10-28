package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
