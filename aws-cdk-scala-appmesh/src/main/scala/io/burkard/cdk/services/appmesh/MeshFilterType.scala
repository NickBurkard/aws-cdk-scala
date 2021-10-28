package io.burkard.cdk.services.appmesh

sealed abstract class MeshFilterType(val underlying: software.amazon.awscdk.services.appmesh.MeshFilterType)
  extends Product
    with Serializable

object MeshFilterType {
  implicit def toAws(value: MeshFilterType): software.amazon.awscdk.services.appmesh.MeshFilterType =
    Option(value).map(_.underlying).orNull

  case object AllowAll
    extends MeshFilterType(software.amazon.awscdk.services.appmesh.MeshFilterType.ALLOW_ALL)

  case object DropAll
    extends MeshFilterType(software.amazon.awscdk.services.appmesh.MeshFilterType.DROP_ALL)
}
