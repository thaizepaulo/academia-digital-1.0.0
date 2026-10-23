package me.dio.academia.digital.entity.form;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "O id do aluno precisa ser positivo.")
  private Long alunoId;

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "'${validatedValue}' precisa ser positivo.")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "'${validatedValue}' precisa ser positivo.")
  @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
  private double altura;
}
