package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFrameworkProps {

  def apply(
    frameworkDescription: Option[String] = None,
    frameworkControls: Option[List[_]] = None,
    frameworkName: Option[String] = None,
    frameworkTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.backup.CfnFrameworkProps =
    (new software.amazon.awscdk.services.backup.CfnFrameworkProps.Builder)
      .frameworkDescription(frameworkDescription.orNull)
      .frameworkControls(frameworkControls.map(_.asJava).orNull)
      .frameworkName(frameworkName.orNull)
      .frameworkTags(frameworkTags.map(_.asJava).orNull)
      .build()
}
