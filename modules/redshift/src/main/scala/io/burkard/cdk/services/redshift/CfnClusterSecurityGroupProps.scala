package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterSecurityGroupProps {

  def apply(
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps =
    (new software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps.Builder)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
