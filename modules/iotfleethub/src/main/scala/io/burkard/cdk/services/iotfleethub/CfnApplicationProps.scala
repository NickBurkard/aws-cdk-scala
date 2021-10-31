package io.burkard.cdk.services.iotfleethub

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    applicationName: Option[String] = None,
    applicationDescription: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.iotfleethub.CfnApplicationProps =
    (new software.amazon.awscdk.services.iotfleethub.CfnApplicationProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .applicationName(applicationName.orNull)
      .applicationDescription(applicationDescription.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
