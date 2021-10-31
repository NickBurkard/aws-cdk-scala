package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplication {

  def apply(
    internalResourceId: String,
    location0: Option[String] = None,
    location1: Option[software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty] = None,
    tags: Option[Map[String, String]] = None,
    notificationArns: Option[List[String]] = None,
    timeoutInMinutes: Option[Number] = None,
    parameters: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sam.CfnApplication =
    software.amazon.awscdk.services.sam.CfnApplication.Builder
      .create(stackCtx, internalResourceId)
      .location(location0.orNull)
      .location(location1.orNull)
      .tags(tags.map(_.asJava).orNull)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .timeoutInMinutes(timeoutInMinutes.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
