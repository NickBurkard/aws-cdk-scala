package io.burkard.cdk.services.dynamodb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProjectionProperty {

  def apply(
    projectionType: Option[String] = None,
    nonKeyAttributes: Option[List[String]] = None
  ): software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnTable.ProjectionProperty.Builder)
      .projectionType(projectionType.orNull)
      .nonKeyAttributes(nonKeyAttributes.map(_.asJava).orNull)
      .build()
}
