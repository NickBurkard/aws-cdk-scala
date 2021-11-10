package io.burkard.cdk.core


sealed abstract class RemovalPolicy(val underlying: software.amazon.awscdk.RemovalPolicy)
  extends Product
    with Serializable


object RemovalPolicy {
  implicit def toAws(value: RemovalPolicy): software.amazon.awscdk.RemovalPolicy =
    Option(value).map(_.underlying).orNull

  case object Destroy
    extends RemovalPolicy(software.amazon.awscdk.RemovalPolicy.DESTROY)

  case object Retain
    extends RemovalPolicy(software.amazon.awscdk.RemovalPolicy.RETAIN)

  case object Snapshot
    extends RemovalPolicy(software.amazon.awscdk.RemovalPolicy.SNAPSHOT)
}
