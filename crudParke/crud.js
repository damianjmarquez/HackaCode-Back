const url ="http://localhost:8080/personas/traer"
const contenedor = document.querySelector('tbody')
let resultados = ''
const modalArticulo = new bootstrap.Modal(document.getElementById('modalArticulo'))
const FormArticulo  = document.querySelector('form')
const usuario  = document.getElementById('usuario')
const clave  = document.getElementById('contraseña')
let opcion=''

btnCrear.addEventListener('click', ()=>{
   
    modalArticulo.show()
   
    opcion = 'crear'
    
})
//funcion para mostrar resusltados
const mostrar =(articulos) =>{
    articulos.forEach(articulo => {
        resultados +=  `<tr>
                            <td>${articulo.usuario}</td>
                            <td>${articulo.contraseña}</td>
                            <td class="text-center"> <a class="btnEditar btn btn-primary">Editar</a><a class="btnBorrar btn btn-danger">Eliminar</a></td>

                        </tr>`
        
    })

    contenedor.innerHTML = resultados
}




//procedimient0 mostrar

fetch(url)
.then(response => response.json())
.then(data=> mostrar(data))
.catch(error => console.log(error))

const on = (element, event, selector, handler)=>{
    
    element.addEventListener(event, e =>{
        if(e.tarjet.closest(selector)){
            handler(e)
        }
    })
}


on(document, "click", '.btnBorrar', e =>{
    consosle.log('BORRADO')
})