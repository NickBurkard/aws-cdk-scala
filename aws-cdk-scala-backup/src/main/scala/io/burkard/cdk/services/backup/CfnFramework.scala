package io.burkard.cdk.services.backup

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFramework {

  def apply(
    internalResourceId: String,
    frameworkDescription: Option[String] = None,
    frameworkControls: Option[List[_]] = None,
    frameworkName: Option[String] = None,
    frameworkTags: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.backup.CfnFramework =
    software.amazon.awscdk.services.backup.CfnFramework.Builder
      .create(stackCtx, internalResourceId)
      .frameworkDescription(frameworkDescription.orNull)
      .frameworkControls(frameworkControls.map(_.asJava).orNull)
      .frameworkName(frameworkName.orNull)
      .frameworkTags(frameworkTags.map(_.asJava).orNull)
      .build()
}
