package io.burkard.cdk.services.codedeploy

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationProps {

  def apply(
    computePlatform: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    applicationName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnApplicationProps =
    (new software.amazon.awscdk.services.codedeploy.CfnApplicationProps.Builder)
      .computePlatform(computePlatform.orNull)
      .tags(tags.map(_.asJava).orNull)
      .applicationName(applicationName.orNull)
      .build()
}
