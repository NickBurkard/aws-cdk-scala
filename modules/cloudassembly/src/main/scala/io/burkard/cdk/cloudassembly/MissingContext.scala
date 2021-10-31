package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MissingContext {

  def apply(
    provider: Option[software.amazon.awscdk.cloudassembly.schema.ContextProvider] = None,
    key: Option[String] = None,
    props0: Option[software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery] = None,
    props1: Option[software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery] = None,
    props2: Option[software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery] = None,
    props3: Option[software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery] = None,
    props4: Option[software.amazon.awscdk.cloudassembly.schema.KeyContextQuery] = None,
    props5: Option[software.amazon.awscdk.cloudassembly.schema.AmiContextQuery] = None,
    props6: Option[software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery] = None,
    props7: Option[software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery] = None,
    props8: Option[software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery] = None,
    props9: Option[software.amazon.awscdk.cloudassembly.schema.VpcContextQuery] = None
  ): software.amazon.awscdk.cloudassembly.schema.MissingContext =
    (new software.amazon.awscdk.cloudassembly.schema.MissingContext.Builder)
      .provider(provider.orNull)
      .key(key.orNull)
      .props(props0.orNull)
      .props(props1.orNull)
      .props(props2.orNull)
      .props(props3.orNull)
      .props(props4.orNull)
      .props(props5.orNull)
      .props(props6.orNull)
      .props(props7.orNull)
      .props(props8.orNull)
      .props(props9.orNull)
      .build()
}
