package io.burkard.cdk.core

sealed abstract class CfnDeletionPolicy(val underlying: software.amazon.awscdk.CfnDeletionPolicy)
  extends Product
    with Serializable

object CfnDeletionPolicy {
  implicit def toAws(value: CfnDeletionPolicy): software.amazon.awscdk.CfnDeletionPolicy =
    Option(value).map(_.underlying).orNull

  case object Delete
    extends CfnDeletionPolicy(software.amazon.awscdk.CfnDeletionPolicy.DELETE)

  case object Retain
    extends CfnDeletionPolicy(software.amazon.awscdk.CfnDeletionPolicy.RETAIN)

  case object Snapshot
    extends CfnDeletionPolicy(software.amazon.awscdk.CfnDeletionPolicy.SNAPSHOT)
}
