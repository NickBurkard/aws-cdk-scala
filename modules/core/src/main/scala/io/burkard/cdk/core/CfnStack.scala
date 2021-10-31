package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStack {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    notificationArns: Option[List[String]] = None,
    templateUrl: Option[String] = None,
    timeoutInMinutes: Option[Number] = None,
    parameters: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnStack =
    software.amazon.awscdk.CfnStack.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .templateUrl(templateUrl.orNull)
      .timeoutInMinutes(timeoutInMinutes.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
