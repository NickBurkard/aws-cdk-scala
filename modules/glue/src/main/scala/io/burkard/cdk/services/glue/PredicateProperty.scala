package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PredicateProperty {

  def apply(
    conditions: Option[List[_]] = None,
    logical: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty =
    (new software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .logical(logical.orNull)
      .build()
}
