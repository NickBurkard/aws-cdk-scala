package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MissingContext {

  def apply(
    provider: software.amazon.awscdk.cloudassembly.schema.ContextProvider,
    key: String,
    props0: software.amazon.awscdk.cloudassembly.schema.LoadBalancerContextQuery,
    props1: software.amazon.awscdk.cloudassembly.schema.EndpointServiceAvailabilityZonesContextQuery,
    props2: software.amazon.awscdk.cloudassembly.schema.VpcContextQuery,
    props3: software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery,
    props4: software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery,
    props5: software.amazon.awscdk.cloudassembly.schema.KeyContextQuery,
    props6: software.amazon.awscdk.cloudassembly.schema.AmiContextQuery,
    props7: software.amazon.awscdk.cloudassembly.schema.AvailabilityZonesContextQuery,
    props8: software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery,
    props9: software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery
  ): software.amazon.awscdk.cloudassembly.schema.MissingContext =
    (new software.amazon.awscdk.cloudassembly.schema.MissingContext.Builder)
      .provider(provider)
      .key(key)
      .props(props0)
      .props(props1)
      .props(props2)
      .props(props3)
      .props(props4)
      .props(props5)
      .props(props6)
      .props(props7)
      .props(props8)
      .props(props9)
      .build()
}
