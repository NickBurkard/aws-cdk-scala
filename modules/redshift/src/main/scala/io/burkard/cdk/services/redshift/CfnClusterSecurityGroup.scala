package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClusterSecurityGroup {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup =
    software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
