package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServiceManagedS3Property {

  def apply: software.amazon.awscdk.services.iotanalytics.CfnDatastore.ServiceManagedS3Property =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.ServiceManagedS3Property.Builder)
      
      .build()
}
