package io.burkard.cdk.cxapi

sealed abstract class VpcSubnetGroupType(val underlying: software.amazon.awscdk.cxapi.VpcSubnetGroupType)
  extends Product
    with Serializable

object VpcSubnetGroupType {
  implicit def toAws(value: VpcSubnetGroupType): software.amazon.awscdk.cxapi.VpcSubnetGroupType =
    Option(value).map(_.underlying).orNull

  case object Public
    extends VpcSubnetGroupType(software.amazon.awscdk.cxapi.VpcSubnetGroupType.PUBLIC)

  case object Private
    extends VpcSubnetGroupType(software.amazon.awscdk.cxapi.VpcSubnetGroupType.PRIVATE)

  case object Isolated
    extends VpcSubnetGroupType(software.amazon.awscdk.cxapi.VpcSubnetGroupType.ISOLATED)
}
