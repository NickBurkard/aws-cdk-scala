package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProjectionProperty {

  def apply(
    projectionType: Option[String] = None,
    nonKeyAttributes: Option[List[String]] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty.Builder)
      .projectionType(projectionType.orNull)
      .nonKeyAttributes(nonKeyAttributes.map(_.asJava).orNull)
      .build()
}
