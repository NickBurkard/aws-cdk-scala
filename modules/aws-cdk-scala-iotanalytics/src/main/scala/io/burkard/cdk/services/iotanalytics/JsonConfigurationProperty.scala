package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JsonConfigurationProperty {

  def apply: software.amazon.awscdk.services.iotanalytics.CfnDatastore.JsonConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.JsonConfigurationProperty.Builder)
      
      .build()
}
