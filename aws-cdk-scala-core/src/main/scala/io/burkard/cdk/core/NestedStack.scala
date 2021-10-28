package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NestedStack {

  def apply(
    internalResourceId: String,
    notificationArns: Option[List[String]] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    parameters: Option[Map[String, String]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.NestedStack =
    software.amazon.awscdk.NestedStack.Builder
      .create(stackCtx, internalResourceId)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .timeout(timeout.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
