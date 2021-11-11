package io.burkard.cdk.services.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NestedStack {

  def apply(
    internalResourceId: String,
    parameters: Option[Map[String, String]] = None,
    notifications: Option[List[_ <: software.amazon.awscdk.services.sns.ITopic]] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudformation.NestedStack =
    software.amazon.awscdk.services.cloudformation.NestedStack.Builder
      .create(stackCtx, internalResourceId)
      .parameters(parameters.map(_.asJava).orNull)
      .notifications(notifications.map(_.asJava).orNull)
      .timeout(timeout.orNull)
      .build()
}
