package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceManagedS3Property {

  def apply: software.amazon.awscdk.services.iotanalytics.CfnDatastore.ServiceManagedS3Property =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.ServiceManagedS3Property.Builder)
      
      .build()
}
