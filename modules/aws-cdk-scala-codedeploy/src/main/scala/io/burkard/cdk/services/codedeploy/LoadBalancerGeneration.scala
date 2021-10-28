package io.burkard.cdk.services.codedeploy

sealed abstract class LoadBalancerGeneration(val underlying: software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration)
  extends Product
    with Serializable

object LoadBalancerGeneration {
  implicit def toAws(value: LoadBalancerGeneration): software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration =
    Option(value).map(_.underlying).orNull

  case object First
    extends LoadBalancerGeneration(software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration.FIRST)

  case object Second
    extends LoadBalancerGeneration(software.amazon.awscdk.services.codedeploy.LoadBalancerGeneration.SECOND)
}
