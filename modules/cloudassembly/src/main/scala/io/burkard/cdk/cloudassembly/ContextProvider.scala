package io.burkard.cdk.cloudassembly

sealed abstract class ContextProvider(val underlying: software.amazon.awscdk.cloudassembly.schema.ContextProvider)
  extends Product
    with Serializable

object ContextProvider {
  implicit def toAws(value: ContextProvider): software.amazon.awscdk.cloudassembly.schema.ContextProvider =
    Option(value).map(_.underlying).orNull

  case object AmiProvider
    extends ContextProvider(software.amazon.awscdk.cloudassembly.schema.ContextProvider.AMI_PROVIDER)

  case object AvailabilityZoneProvider
    extends ContextProvider(software.amazon.awscdk.cloudassembly.schema.ContextProvider.AVAILABILITY_ZONE_PROVIDER)

  case object EndpointServiceAvailabilityZoneProvider
    extends ContextProvider(software.amazon.awscdk.cloudassembly.schema.ContextProvider.ENDPOINT_SERVICE_AVAILABILITY_ZONE_PROVIDER)

  case object HostedZoneProvider
    extends ContextProvider(software.amazon.awscdk.cloudassembly.schema.ContextProvider.HOSTED_ZONE_PROVIDER)

  case object KeyProvider
    extends ContextProvider(software.amazon.awscdk.cloudassembly.schema.ContextProvider.KEY_PROVIDER)

  case object LoadBalancerListenerProvider
    extends ContextProvider(software.amazon.awscdk.cloudassembly.schema.ContextProvider.LOAD_BALANCER_LISTENER_PROVIDER)

  case object LoadBalancerProvider
    extends ContextProvider(software.amazon.awscdk.cloudassembly.schema.ContextProvider.LOAD_BALANCER_PROVIDER)

  case object SecurityGroupProvider
    extends ContextProvider(software.amazon.awscdk.cloudassembly.schema.ContextProvider.SECURITY_GROUP_PROVIDER)

  case object SsmParameterProvider
    extends ContextProvider(software.amazon.awscdk.cloudassembly.schema.ContextProvider.SSM_PARAMETER_PROVIDER)

  case object VpcProvider
    extends ContextProvider(software.amazon.awscdk.cloudassembly.schema.ContextProvider.VPC_PROVIDER)
}
