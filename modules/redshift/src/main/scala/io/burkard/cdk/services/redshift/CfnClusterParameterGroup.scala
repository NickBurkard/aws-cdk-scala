package io.burkard.cdk.services.redshift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterParameterGroup {

  def apply(
    internalResourceId: String,
    description: String,
    parameterGroupFamily: String,
    parameters: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.redshift.CfnClusterParameterGroup =
    software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .description(description)
      .parameterGroupFamily(parameterGroupFamily)
      .parameters(parameters.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
