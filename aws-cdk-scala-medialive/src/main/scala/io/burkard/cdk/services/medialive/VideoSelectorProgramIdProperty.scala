package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VideoSelectorProgramIdProperty {

  def apply(
    programId: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProgramIdProperty.Builder)
      .programId(programId.orNull)
      .build()
}
