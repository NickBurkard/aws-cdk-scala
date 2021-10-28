package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMappingProps {

  def apply(
    `lazy`: Option[Boolean] = None,
    mapping: Option[Map[String, _ <: Map[String, _]]] = None
  ): software.amazon.awscdk.CfnMappingProps =
    (new software.amazon.awscdk.CfnMappingProps.Builder)
      .`lazy`(`lazy`.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .mapping(mapping.map(_.view.mapValues(_.asJava).toMap.asJava).orNull)
      .build()
}
