package io.burkard.cdk.services.cloudformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStackProps {

  def apply(
    templateUrl: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    notificationArns: Option[List[String]] = None,
    timeoutInMinutes: Option[Number] = None,
    parameters: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.cloudformation.CfnStackProps =
    (new software.amazon.awscdk.services.cloudformation.CfnStackProps.Builder)
      .templateUrl(templateUrl)
      .tags(tags.map(_.asJava).orNull)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .timeoutInMinutes(timeoutInMinutes.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
