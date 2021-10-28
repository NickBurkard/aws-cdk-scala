package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMapping {

  def apply(
    internalResourceId: String,
    `lazy`: Option[Boolean] = None,
    mapping: Option[Map[String, _ <: Map[String, _]]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnMapping =
    software.amazon.awscdk.CfnMapping.Builder
      .create(stackCtx, internalResourceId)
      .`lazy`(`lazy`.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .mapping(mapping.map(_.view.mapValues(_.asJava).toMap.asJava).orNull)
      .build()
}
