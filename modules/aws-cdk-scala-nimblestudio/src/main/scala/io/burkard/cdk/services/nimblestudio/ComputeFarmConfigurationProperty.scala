package io.burkard.cdk.services.nimblestudio

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ComputeFarmConfigurationProperty {

  def apply(
    activeDirectoryUser: Option[String] = None,
    endpoint: Option[String] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.ComputeFarmConfigurationProperty.Builder)
      .activeDirectoryUser(activeDirectoryUser.orNull)
      .endpoint(endpoint.orNull)
      .build()
}
