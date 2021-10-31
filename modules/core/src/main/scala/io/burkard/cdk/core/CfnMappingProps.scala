package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMappingProps {

  def apply(
    `lazy`: Option[Boolean] = None,
    mapping: Option[Map[String, _ <: Map[String, _]]] = None
  ): software.amazon.awscdk.CfnMappingProps =
    (new software.amazon.awscdk.CfnMappingProps.Builder)
      .`lazy`(`lazy`.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .mapping(mapping.map(_.mapValues(_.asJava).toMap.asJava).orNull)
      .build()
}
