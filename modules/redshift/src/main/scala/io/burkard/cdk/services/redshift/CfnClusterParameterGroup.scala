package io.burkard.cdk.services.redshift

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClusterParameterGroup {

  def apply(
    internalResourceId: String,
    parameters: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    parameterGroupFamily: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.redshift.CfnClusterParameterGroup =
    software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .parameters(parameters.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .parameterGroupFamily(parameterGroupFamily.orNull)
      .build()
}