package io.burkard.cdk.services.memorydb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnParameterGroup {

  def apply(
    internalResourceId: String,
    parameterGroupName: Option[String] = None,
    family: Option[String] = None,
    parameters: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.memorydb.CfnParameterGroup =
    software.amazon.awscdk.services.memorydb.CfnParameterGroup.Builder
      .create(stackCtx, internalResourceId)
      .parameterGroupName(parameterGroupName.orNull)
      .family(family.orNull)
      .parameters(parameters.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
