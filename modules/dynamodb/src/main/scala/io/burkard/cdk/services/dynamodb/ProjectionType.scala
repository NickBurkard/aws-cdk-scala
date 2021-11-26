package io.burkard.cdk.services.dynamodb

sealed abstract class ProjectionType(val underlying: software.amazon.awscdk.services.dynamodb.ProjectionType)
  extends Product
    with Serializable

object ProjectionType {
  implicit def toAws(value: ProjectionType): software.amazon.awscdk.services.dynamodb.ProjectionType =
    Option(value).map(_.underlying).orNull

  case object All
    extends ProjectionType(software.amazon.awscdk.services.dynamodb.ProjectionType.ALL)

  case object Include
    extends ProjectionType(software.amazon.awscdk.services.dynamodb.ProjectionType.INCLUDE)

  case object KeysOnly
    extends ProjectionType(software.amazon.awscdk.services.dynamodb.ProjectionType.KEYS_ONLY)
}
