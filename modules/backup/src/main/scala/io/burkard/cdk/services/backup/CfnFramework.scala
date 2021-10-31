package io.burkard.cdk.services.backup

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
